(ns ogbe.fulcro.mui.icons.close-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CloseRounded" :default CloseRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-close-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CloseRounded)))