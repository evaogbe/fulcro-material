(ns ogbe.fulcro.mui.icons.tab-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TabSharp" :default TabSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tab-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TabSharp)))