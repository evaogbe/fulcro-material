(ns ogbe.fulcro.mui.icons.refresh-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RefreshSharp" :default RefreshSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-refresh-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RefreshSharp)))