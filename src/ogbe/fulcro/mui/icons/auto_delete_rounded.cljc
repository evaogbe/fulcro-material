(ns ogbe.fulcro.mui.icons.auto-delete-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AutoDeleteRounded" :default AutoDeleteRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-auto-delete-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AutoDeleteRounded)))