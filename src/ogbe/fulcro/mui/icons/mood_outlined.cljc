(ns ogbe.fulcro.mui.icons.mood-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MoodOutlined" :default MoodOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mood-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MoodOutlined)))