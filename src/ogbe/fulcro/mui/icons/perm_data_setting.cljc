(ns ogbe.fulcro.mui.icons.perm-data-setting
  #?(:cljs (:require
            ["@mui/icons-material/PermDataSetting" :default PermDataSetting]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-perm-data-setting
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PermDataSetting)))