(ns ogbe.fulcro.mui.icons.plagiarism-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PlagiarismOutlined" :default PlagiarismOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-plagiarism-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlagiarismOutlined)))