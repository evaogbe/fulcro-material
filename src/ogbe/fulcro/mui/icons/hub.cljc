(ns ogbe.fulcro.mui.icons.hub
  #?(:cljs (:require
            ["@mui/icons-material/Hub" :default Hub]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hub
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Hub)))