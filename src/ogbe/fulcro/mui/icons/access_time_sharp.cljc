(ns ogbe.fulcro.mui.icons.access-time-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AccessTimeSharp" :default AccessTimeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-access-time-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccessTimeSharp)))