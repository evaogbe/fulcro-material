(ns ogbe.fulcro.mui.icons.zoom-in-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ZoomInRounded" :default ZoomInRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-zoom-in-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ZoomInRounded)))