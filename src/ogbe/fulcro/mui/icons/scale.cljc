(ns ogbe.fulcro.mui.icons.scale
  #?(:cljs (:require
            ["@mui/icons-material/Scale" :default Scale]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-scale
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Scale)))