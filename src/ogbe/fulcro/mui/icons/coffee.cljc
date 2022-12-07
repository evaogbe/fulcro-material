(ns ogbe.fulcro.mui.icons.coffee
  #?(:cljs (:require
            ["@mui/icons-material/Coffee" :default Coffee]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-coffee
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Coffee)))