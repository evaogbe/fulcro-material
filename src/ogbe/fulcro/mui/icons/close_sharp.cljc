(ns ogbe.fulcro.mui.icons.close-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CloseSharp" :default CloseSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-close-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CloseSharp)))