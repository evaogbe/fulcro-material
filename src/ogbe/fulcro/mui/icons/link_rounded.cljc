(ns ogbe.fulcro.mui.icons.link-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LinkRounded" :default LinkRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-link-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LinkRounded)))