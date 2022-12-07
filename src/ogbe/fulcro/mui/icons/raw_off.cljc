(ns ogbe.fulcro.mui.icons.raw-off
  #?(:cljs (:require
            ["@mui/icons-material/RawOff" :default RawOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-raw-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RawOff)))