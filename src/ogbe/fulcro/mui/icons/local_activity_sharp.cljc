(ns ogbe.fulcro.mui.icons.local-activity-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LocalActivitySharp" :default LocalActivitySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-activity-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalActivitySharp)))