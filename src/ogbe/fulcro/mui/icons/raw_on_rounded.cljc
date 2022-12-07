(ns ogbe.fulcro.mui.icons.raw-on-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RawOnRounded" :default RawOnRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-raw-on-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RawOnRounded)))