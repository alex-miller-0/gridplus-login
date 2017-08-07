import { StyleSheet } from 'react-native'
import { Metrics } from './Metrics'

export default StyleSheet.create({
  container: {
    paddingBottom: Metrics.baseMargin
  },
  logo: {
    marginTop: Metrics.doubleSection,
    height: Metrics.images.logo,
    width: Metrics.images.logo,
    resizeMode: 'contain'
  },
  agent: {
    height: 200,
    width: 200,
  },
  centered: {
    alignItems: 'center'
  },
  section: {
    backgroundColor:'blue'
  }
})