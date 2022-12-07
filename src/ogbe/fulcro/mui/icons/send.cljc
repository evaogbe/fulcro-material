(ns ogbe.fulcro.mui.icons.send
  #?(:cljs (:require
            ["@mui/icons-material/Send" :default Send]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-send
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Send)))