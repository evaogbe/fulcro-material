(ns ogbe.fulcro.mui.icons.anchor
  #?(:cljs (:require
            ["@mui/icons-material/Anchor" :default Anchor]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-anchor
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Anchor)))