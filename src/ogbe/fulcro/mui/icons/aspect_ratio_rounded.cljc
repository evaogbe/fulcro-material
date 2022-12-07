(ns ogbe.fulcro.mui.icons.aspect-ratio-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AspectRatioRounded" :default AspectRatioRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-aspect-ratio-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AspectRatioRounded)))