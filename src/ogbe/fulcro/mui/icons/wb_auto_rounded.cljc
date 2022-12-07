(ns ogbe.fulcro.mui.icons.wb-auto-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WbAutoRounded" :default WbAutoRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wb-auto-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WbAutoRounded)))