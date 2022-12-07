(ns ogbe.fulcro.mui.icons.index
  #?(:cljs (:require
            ["@mui/icons-material/index" :default index]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-index
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory index)))