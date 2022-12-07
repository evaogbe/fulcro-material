(ns ogbe.fulcro.mui.icons.aspect-ratio
  #?(:cljs (:require
            ["@mui/icons-material/AspectRatio" :default AspectRatio]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-aspect-ratio
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AspectRatio)))