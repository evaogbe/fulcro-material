(ns ogbe.fulcro.mui.icons.support-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SupportSharp" :default SupportSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-support-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SupportSharp)))