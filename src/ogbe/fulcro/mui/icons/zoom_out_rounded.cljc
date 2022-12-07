(ns ogbe.fulcro.mui.icons.zoom-out-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ZoomOutRounded" :default ZoomOutRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-zoom-out-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ZoomOutRounded)))