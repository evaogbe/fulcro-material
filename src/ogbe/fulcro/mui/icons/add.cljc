(ns ogbe.fulcro.mui.icons.add
  #?(:cljs (:require
            ["@mui/icons-material/Add" :default Add]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Add)))