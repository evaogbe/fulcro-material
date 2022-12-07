(ns ogbe.fulcro.mui.icons.input
  #?(:cljs (:require
            ["@mui/icons-material/Input" :default Input]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-input
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Input)))