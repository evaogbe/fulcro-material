(ns ogbe.fulcro.mui.icons.group-sharp
  #?(:cljs (:require
            ["@mui/icons-material/GroupSharp" :default GroupSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-group-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GroupSharp)))