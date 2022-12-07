(ns ogbe.fulcro.mui.icons.circle
  #?(:cljs (:require
            ["@mui/icons-material/Circle" :default Circle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-circle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Circle)))