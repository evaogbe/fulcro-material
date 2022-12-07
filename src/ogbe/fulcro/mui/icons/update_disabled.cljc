(ns ogbe.fulcro.mui.icons.update-disabled
  #?(:cljs (:require
            ["@mui/icons-material/UpdateDisabled" :default UpdateDisabled]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-update-disabled
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UpdateDisabled)))