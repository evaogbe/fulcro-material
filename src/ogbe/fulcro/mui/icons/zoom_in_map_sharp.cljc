(ns ogbe.fulcro.mui.icons.zoom-in-map-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ZoomInMapSharp" :default ZoomInMapSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-zoom-in-map-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ZoomInMapSharp)))