(ns ogbe.fulcro.mui.icons.anchor-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AnchorRounded" :default AnchorRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-anchor-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AnchorRounded)))