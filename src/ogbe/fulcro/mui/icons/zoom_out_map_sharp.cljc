(ns ogbe.fulcro.mui.icons.zoom-out-map-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ZoomOutMapSharp" :default ZoomOutMapSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-zoom-out-map-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ZoomOutMapSharp)))