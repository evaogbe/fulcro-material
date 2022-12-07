(ns ogbe.fulcro.mui.icons.wb-auto
  #?(:cljs (:require
            ["@mui/icons-material/WbAuto" :default WbAuto]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wb-auto
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WbAuto)))