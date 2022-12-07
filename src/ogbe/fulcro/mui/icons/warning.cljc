(ns ogbe.fulcro.mui.icons.warning
  #?(:cljs (:require
            ["@mui/icons-material/Warning" :default Warning]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-warning
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Warning)))