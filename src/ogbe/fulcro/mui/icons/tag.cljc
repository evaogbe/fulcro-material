(ns ogbe.fulcro.mui.icons.tag
  #?(:cljs (:require
            ["@mui/icons-material/Tag" :default Tag]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tag
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Tag)))