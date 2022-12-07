(ns ogbe.fulcro.mui.icons.apps-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AppsSharp" :default AppsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-apps-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AppsSharp)))