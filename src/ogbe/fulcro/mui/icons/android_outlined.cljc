(ns ogbe.fulcro.mui.icons.android-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AndroidOutlined" :default AndroidOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-android-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AndroidOutlined)))