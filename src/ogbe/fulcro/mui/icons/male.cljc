(ns ogbe.fulcro.mui.icons.male
  #?(:cljs (:require
            ["@mui/icons-material/Male" :default Male]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-male
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Male)))