(ns ogbe.fulcro.mui.icons.flight
  #?(:cljs (:require
            ["@mui/icons-material/Flight" :default Flight]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flight
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Flight)))