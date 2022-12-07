(ns ogbe.fulcro.mui.icons.house
  #?(:cljs (:require
            ["@mui/icons-material/House" :default House]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-house
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory House)))