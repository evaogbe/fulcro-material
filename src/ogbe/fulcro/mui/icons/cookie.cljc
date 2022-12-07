(ns ogbe.fulcro.mui.icons.cookie
  #?(:cljs (:require
            ["@mui/icons-material/Cookie" :default Cookie]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cookie
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Cookie)))