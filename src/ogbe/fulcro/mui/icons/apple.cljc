(ns ogbe.fulcro.mui.icons.apple
  #?(:cljs (:require
            ["@mui/icons-material/Apple" :default Apple]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-apple
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Apple)))