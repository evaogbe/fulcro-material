(ns ogbe.fulcro.mui.icons.remember-me-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RememberMeSharp" :default RememberMeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-remember-me-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RememberMeSharp)))