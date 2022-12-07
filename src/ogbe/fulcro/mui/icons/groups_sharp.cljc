(ns ogbe.fulcro.mui.icons.groups-sharp
  #?(:cljs (:require
            ["@mui/icons-material/GroupsSharp" :default GroupsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-groups-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GroupsSharp)))