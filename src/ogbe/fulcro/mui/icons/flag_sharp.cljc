(ns ogbe.fulcro.mui.icons.flag-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FlagSharp" :default FlagSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flag-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlagSharp)))