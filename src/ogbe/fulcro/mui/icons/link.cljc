(ns ogbe.fulcro.mui.icons.link
  #?(:cljs (:require
            ["@mui/icons-material/Link" :default Link]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-link
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Link)))