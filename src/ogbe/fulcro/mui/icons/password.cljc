(ns ogbe.fulcro.mui.icons.password
  #?(:cljs (:require
            ["@mui/icons-material/Password" :default Password]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-password
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Password)))