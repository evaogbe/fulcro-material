(ns ogbe.fulcro.mui.icons.disabled-by-default-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DisabledByDefaultSharp" :default DisabledByDefaultSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-disabled-by-default-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DisabledByDefaultSharp)))