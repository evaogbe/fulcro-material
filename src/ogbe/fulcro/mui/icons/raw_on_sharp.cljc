(ns ogbe.fulcro.mui.icons.raw-on-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RawOnSharp" :default RawOnSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-raw-on-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RawOnSharp)))