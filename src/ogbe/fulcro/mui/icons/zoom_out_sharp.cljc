(ns ogbe.fulcro.mui.icons.zoom-out-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ZoomOutSharp" :default ZoomOutSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-zoom-out-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ZoomOutSharp)))