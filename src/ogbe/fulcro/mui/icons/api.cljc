(ns ogbe.fulcro.mui.icons.api
  #?(:cljs (:require
            ["@mui/icons-material/Api" :default Api]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-api
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Api)))