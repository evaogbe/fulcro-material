(ns ogbe.fulcro.mui.icons.plagiarism-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PlagiarismSharp" :default PlagiarismSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-plagiarism-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlagiarismSharp)))